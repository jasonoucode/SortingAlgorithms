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
default: BubbleSort.class BubbleSortTest.class

# this target entry builds the Average class
# the Average.class file is dependent on the Average.java file
# and the rule associated with this entry gives the command to create it
#
BubbleSort.class: BubbleSort.java
	$(JCC) $(JFLAGS) BubbleSort.java

BubbleSortTest.class: BubbleSortTest.java
	$(JCC) $(JFLAGS) BubbleSortTest.java

# Running tests to make sure our code is working.
# 'make test' to run tests.
test: BubbleSortTest.class
	java BubbleSortTest

# To start over from scratch, type 'make clean'.
# Removes all .class files, so that the next make rebuilds them
#
clean:
	$(RM) *.class