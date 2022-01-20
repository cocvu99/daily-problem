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

in_arr = []

out_arr = []
n = int(input("Do dai mang?: "))
temp_arr = [1] * n
bc = 1

for i in range(0, n):
    element = int(input())
    in_arr.append(element)
    bc = bc * element

def MultiEle(arr, brr):
    # temp = 1
    for i in range(0, len(arr)):
        arr[i] = bc / arr[i]
        brr.append(int(float(arr[i])))
        # arr.append(arr[i])
        # temp = temp * arr[i]

def main():
    # for i in range(0, len(in_arr)):
    #     temp_arr.append(MultiEle(in_arr))

    # for i in range(0, len(in_arr)):
    # MultiEle(in_arr)
    MultiEle(in_arr, out_arr)
    print(out_arr)

if __name__ == "__main__":
    main()
