#
# A simple makefile for compiling three java classes
#

# define a makefile variable for the java compiler
#
JCC = javac

# define a makefile variable for compilation flags
# the -g flag compiles with debugging information
#
JFLAGS = -g

# typing 'make' will invoke the first target entry in the makefile
# (the default one in this case)
#
default: InsertionSort.class InsertionSortTest.class

# this target entry builds the InsertionSort and InsertionSortTest Classes
#
InsertionSort.class: InsertionSort.java
	$(JCC) $(JFLAGS) InsertionSort.java

InsertionSortTest.class: InsertionSortTest.java
	$(JCC) $(JFLAGS) InsertionSortTest.java

# Running tests to make sure our code is working.
# 'make test' to run tests.
test: InsertionSortTest.class
	java InsertionSortTest

# To start over from scratch, type 'make clean'.
# Removes all .class files, so that the next make rebuilds them
#
clean:
	$(RM) *.class
