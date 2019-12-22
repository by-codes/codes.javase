export SCRIPT_PATH=$(dirname "$0")
export PROJ_PATH=$SCRIPT_PATH/..
export LIBS_PATH=$PROJ_PATH/libs
export TARGET_PATH=$PROJ_PATH/target

java -jar $TARGET_PATH/app.jar