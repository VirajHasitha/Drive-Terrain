# Drive-Terrain 

This repo contains a sample code answer to the following question.

A driver assist sensor measures the height of the next three points on the road. You are required to write a Java method
that takes the three measurements and returns the drive terrain type. Use nested if-else statements to complete the
method below according to the rules mentioned in its comments.
/**
* Takes an int Array representing the height of the next 3 points on the road
* and returns a String according to the following rules:
* all equal values (e.g. {5,5,5}) -> return "flat"
* monotonic increasing values (e.g. {2,3,4}) -> return "uphill"
* monotonic decreasing values (e.g. {9,4,1}) -> return "downhill"
* first two equal values and greater third value (e.g. {4,4,8}) -> return "uphill approach"
* first two equal values and smaller third value (e.g. {6,6,5}) -> return "downhill approach"
* smaller first value followed by last two equal values (e.g. {5,9,9}) -> return "plateau"
* larger first value followed by last two equal values (e.g. {7,4,4}) -> return "bogland"
* second value larger than the first and third values (e.g. {7,9,6}) -> return "hill"
* second value smaller than the first and third values (e.g. {8,7,9}) -> return "valley"
*/
 public String driveTerrain(int[] t)
