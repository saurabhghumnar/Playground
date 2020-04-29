#include<iostream>
int main()
{
  // Type your code here
  int i,n;
  std::cin>>n;
  do
  {
    n=n/10;
    i++;
  }while(n>0);
  std::cout<<i;
}