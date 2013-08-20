thrift --gen java user_v2.thrift
rsync -a gen-java/org ../java
rm -rf gen-java
