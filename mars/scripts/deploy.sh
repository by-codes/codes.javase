export SCRIPT_PATH=$(dirname "$0")
export PROJ_PATH=$SCRIPT_PATH/..
export TARGET_PATH=$PROJ_PATH/target

rm -rf $PROJ_PATH/mars.tar.gz
tar -czvf $PROJ_PATH/mars.tar.gz --exclude classes/ -C $TARGET_PATH .
