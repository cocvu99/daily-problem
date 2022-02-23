# This problem was asked by Uber.

# Given an array of integers, return a new array such 
# that each element at index i of the new array is the
# product of all the numbers in the original array except
# the one at i.

# For example, if our input was [1, 2, 3, 4, 5], the 
# expected output would be [120, 60, 40, 30, 24]. If 
# our input was [3, 2, 1], the expected output would 
# be [2, 3, 6].

# Follow-up: what if you can't use division?

# TODO: need fix how 2 function use common argument?
# hot-fix: change name function, change order of use function

# Mang? input
from inspect import _void
from tkinter import N


in_arr = []

# Mang? output
out_arr = []
n = int(input("Do dai mang?: "))
bc = 1

for i in range(0, n):
    element = int(input())
    in_arr.append(element)
    bc = bc * element

# Method 1: 
# use 'common multiple', division
def MultiEle(arr1):
    # create array clone & copy
    new_array1 = []
    for i in range(0, len(arr1)):
        arr1[i] = bc / arr1[i]
        new_array1.append(int(float(arr1[i])))

    return new_array1
# Method 2:
# multi all element in array except self
# by using 'if condition' in 'for loop'
def ArrayProduct(arr3):
    new_arr2 = []
    
    for i in arr3:
        element = 1
        for j in arr3:
            if j != i:
                element = element *j
        new_arr2.append(element)
    
    return new_arr2

# Method 3:
def ArrayProduct2(arr4, n):
    array_below = [1]*n
    array_above = [1]*n

    array_above[0] = 1
    array_below[n-1] = 1

    for i in range(1, n):
        array_above[i] = arr4[i-1] * array_above[i-1]

    for i in range(n-2, -1, -1):
        array_below[i] = arr4[i+1] * array_below[i+1]

    array_results = [1]*n
    for i in range(n):
        array_results[i] = array_below[i]  * array_above[i]
    
    return array_results

    # for i in range(1, n):
    #     array_above[i] = 1

    # return array_above

def main():
    print("Array before: ")
    print(in_arr)

    print("Method 2:")
    print(ArrayProduct(in_arr))

    print("Method 3")
    print(ArrayProduct2(in_arr, n))
    
    # MultiEle(in_arr)
    print("Method 1:")
    print(MultiEle(in_arr))

    

if __name__ == "__main__":
    main()
