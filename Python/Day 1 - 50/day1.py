# Given a list of numbers and a number k, 
# return whether any two numbers from the list add up to k

# For example, given [10, 15, 3, 7] and k of 17, 
# return true since 10 + 7 is 17.

# Bonus: Can you do this in one pass?

my_arr = []
n = int(input("Do dai mang?: "))

for i in range(0, n):
    element = int(input())
    my_arr.append(element)

k = int(input("Number k: "))

def FindPairs(arr, k):
    for i in range(0, len(arr)):
        # one pass => O(n) time complexity
        if (k - arr[i]) in arr:
            return True
        return False

    #   2 loop:
    # for i range(0, len(arr)):
    #     for j in range(0, len(arr)):
    #         if k == arr[i] + arr[j]:
    #             return True
    #         return False

def main():
    print(FindPairs(my_arr, k))
    # if FindPairs(my_arr, k) == True:
    #     print("Mang co cap so TM dieu kien")
    # elif FindPairs(my_arr, k) == False:
    #     print("Mang KHONG co cap so TMDK")
    # else:
    #     print("Khong hop le")

if __name__ == "__main__":
    main()

