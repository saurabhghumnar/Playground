#include<iostream>
using namespace std;
int main()
{
  int a;
  std::cin>>a;
  int sum;
  int f,l;
  f=a/1000;
  l=a%10;
  sum=f+l;
  std::cout<<sum;
}