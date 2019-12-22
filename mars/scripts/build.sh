export SCRIPT_PATH=$(dirname "$0")
export PROJ_PATH=$SCRIPT_PATH/..
export LIBS_PATH=$PROJ_PATH/libs
export CONF_PATH=$PROJ_PATH/config
export RES_PATH=$PROJ_PATH/resources
export TARGET_PATH=$PROJ_PATH/target

rm -rf $TARGET_PATH
javac -cp $LIBS_PATH/commons-csv-1.7.jar:$PROJ_PATH/src $PROJ_PATH/src/com/banyuan/mars/App.java -d $TARGET_PATH/classes
cp $RES_PATH/books.xml $TARGET_PATH/classes
cp $RES_PATH/master.csv $TARGET_PATH/classes

mkdir -p $TARGET_PATH/libs
cp $LIBS_PATH/commons-csv-1.7.jar $TARGET_PATH/libs

javadoc -cp $LIBS_PATH/commons-csv-1.7.jar -d $TARGET_PATH/apidocs -sourcepath $PROJ_PATH/src @$PROJ_PATH/config/package.txt

jar --create --file $TARGET_PATH/app.jar --manifest $CONF_PATH/MANIFEST.MF -C $TARGET_PATH/classes .