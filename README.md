# Simon
Simon, the Drawer-er
-----
# Description
Instantiates random Objects (as opposed to Random objects).
Selects a random (sub-)class, a random Constructor and random parameters.
Handles corner-cases, such as enums, singletons, factory methods, etc.
-----
# History
Earlier implementations have been used in the industry to generate mock-data, including images, for PDF forms.
The algorithm was previously called variations on RandomInstantiator, RandomObjectInstantiator and RandomObjectsOfUnusualInstantiation, but was renamed to Simon, the Drawer-er, once the image-generation module produced "interesting" results.
The new name is a tribute to a [certain character](https://www.youtube.com/watch?v=NqmrQKUGrH4&list=PLS_gQd8UB-hJ3f5OZ7JkMpQti72Cgmp0J).
This is the third implementation; it uses AspectJ to prevent infinite recursion loops.
-----
# Links
- [Maven repo](https://www.dropbox.com/sh/qjfeyi6jgs5lemx/AAASG_4sCsf9dtpWU_MrpUYCa?dl=0) for binary artifacts.
- [demo](https://innovanon-inc.github.io/Simon)
