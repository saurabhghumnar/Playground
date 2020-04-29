#include<iostream>
int main()
{
  int x;
  std::cin>>x;
  if(x>-1)
    std::cout<<x<<" is a positive number.";
  else
    std::cout<<x<<" is a negative number.";
}