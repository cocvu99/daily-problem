// NOT DONE WITH BUG

#include <iostream>
using namespace std;

bool FindPairs(int arr[], int k, int n){

    bool flag = false;
    
    for (int i = 0; i < n; i++){
        int s = k - arr[i];
        for (int j = 0; j < n; j++){
            if (s == arr[j]){
                flag = true;
            }
        }
    }
    if (flag == true){
        return true;
    } else {
        return false;
    }
    
}

int main(){
    int number;
    printf("Nhap do dai mang?: ");
    cin >> number;

    int my_arr[number];
    for (int i = 0; i < number; i++){
        cin >> my_arr[i];
    }
    
    int k;
    printf("Number k: ");
    cin >> k;

    for (int i = 0; i < number; i++){
        cout << my_arr[i] << " " << k << endl;
    }
    
    if (FindPairs(my_arr, k, number)){
        cout << "OK TMDK" << endl;
    }   
    else{
        cout << "Khong TMDK" << endl;
    }
    
    
}