#include<iostream>
using namespace std;

int main() {
    if (__cplusplus == 202002L) cout << "C++20\n";
    else if (__cplusplus == 201703L) cout << "C++17\n";
    else if (__cplusplus == 201402L) cout << "C++14\n";
    else if (__cplusplus == 201103L) cout << "C++11\n";
    else std::cout << "pre-standard C++\n";
}