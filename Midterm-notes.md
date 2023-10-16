---
title: CS 007 Midterm Notes
author: Andrew Noonan
---
# Loops
## For loops:
* contain an Initialization Statement
* contain a test statement
*contain an update statement(Usually iterating the variable)
 * Is a *Pretest* loop,meaning it evaluates the test expression before each iteration.

## While loops:
* contain a boolean expression that is tested for a true or false value
* a statement or block of statements that are repeated as long as the expression is true
* Is a *Pretest* loop

## Examples of equivalent and non-equivalent for and while loops:
```
for( int i=0 ; i<10 ; i++)
{			
System.out.println(i);
}
```

```
int i=0;
while( i<10 )
{
	i++;
	System.out.println(i);
}
```

***Not Equivalent***
```
for( int i=10 ; i>0 ; i = i-2 )
{
	System.out.println(i);	
}
```

```
int i=10;
while( i>0 )
{
	System.out.println(i);
	i = i-2;
}
```

***Equivalent***

```
for( int i=1 ; i<10 ; i++ )
{
	System.out.println(i);
}

```

```
int number = 1;
for( int i=9 ; i>0 ; i-- )
{
	System.out.println(number);
	number++;
}
```

***Equivalent***
### Explanation of Code pair three:
This tricked me, because I falsely saw that i=9 and  believed that it was being used in the output, but it is actually only being used as the control variable.

