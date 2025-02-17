# NumberFormatException in Scala's Auxiliary Constructor

This example showcases a potential `NumberFormatException` in Scala when using an auxiliary constructor that implicitly converts a String to an Int using `toInt`. The problem lies in the lack of error handling when a non-numeric string is passed to the constructor.

## How to Reproduce

1.  Run the provided Scala code.
2.  Observe the `NumberFormatException` thrown when attempting to create `myInstance3`.

## Solution

The solution involves implementing proper error handling, such as using a `try-catch` block to gracefully handle potential `NumberFormatException` instances.
