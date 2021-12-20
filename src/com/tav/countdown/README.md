**LEVEL**: 2

Write a CountDownThread with the following properties:
```
private final int rate;
private int counter;
```
When started, the thread should count from a 'counterStartingPoint' down 
to 0 in 'rate' intervals and then stop running

****Example:****

```
-- Running a new count down thread (name: Thread-1, rate: 2 seconds, counterStartingPoint: 30) --
-- Running a new count down thread (name: Thread-0, rate: 5 seconds, counterStartingPoint: 10) --
Thread-0: 10
Thread-1: 30
Thread-1: 29
Thread-1: 28
Thread-0: 9
Thread-1: 27
Thread-1: 26
Thread-0: 8
Thread-1: 25
```


**NOTE**:
The answers are included, try to think about the problem before you check them out!

**TIP**:
Use R.E.A.C.T.O

**R**eview

**E**xamples

**A**pproach

**C**ode

**T**est

**O**ptimize