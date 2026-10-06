# Java-Day-19-Sum-Using-While-Loop
# Java Day 19 - Sum Using While Loop

## Description

This program uses a `while` loop to calculate the sum of numbers from 1 to 10.

## Example Output

```text
Sum = 55
```

## Code

```java
public class Main
{
    public static void main(String[] args)
    {
        int number = 1;
        int sum = 0;

        while (number <= 10)
        {
            sum = sum + number;
            number++;
        }

        System.out.println("Sum = " + sum);
    }
}
```

## Concepts Used

* `while` loop
* Variables
* Addition
* Increment operator `++`
* Conditions
* `System.out.println()`

## How It Works

1. The variable `number` starts from `1`.
2. The variable `sum` starts from `0`.
3. The `while` loop runs while `number` is less than or equal to `10`.
4. Each number is added to `sum`.
5. `number++` increases the number by 1.
6. When `number` becomes `11`, the loop stops.
7. The final sum is displayed.

## Calculation

```text
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
```

## File Name

`Main.java`

## Goal

The goal of this program is to practice using a `while` loop to perform repeated addition and calculate a total.
