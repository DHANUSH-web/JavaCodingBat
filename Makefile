.DEFAULT_GOAL := build

JAVA := java
JAVAC := javac
JUNIT_CONSOLE := lib/junit-platform-console-standalone-1.10.0.jar
MAIN_SOURCES := $(shell find src -name '*.java')
TEST_SOURCES := $(shell find test -name '*.java')
OUT_DIR := out
TEST_OUT_DIR := out-test

.PHONY: build run test clean

build:
	@mkdir -p $(OUT_DIR)
	@$(JAVAC) -d $(OUT_DIR) $(MAIN_SOURCES)
	@echo "Build complete."

run: build
	@echo "========= STARTED ========="
	@$(JAVA) -cp $(OUT_DIR) Main
	@echo "========= FINISHED ========="

test: build
	@echo "========= STARTED ========="
	@mkdir -p $(TEST_OUT_DIR)
	@$(JAVAC) -cp "$(OUT_DIR):lib/*" -d $(TEST_OUT_DIR) $(TEST_SOURCES)
	@$(JAVA) -jar $(JUNIT_CONSOLE) execute -cp "$(OUT_DIR):$(TEST_OUT_DIR)" --scan-class-path
	@echo "========= FINISHED ========="

clean:
	@rm -rf $(OUT_DIR) $(TEST_OUT_DIR)
	@echo "Build outputs removed."
