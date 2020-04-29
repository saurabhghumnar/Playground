#include<iostream>
int main()
{
  int x;
  std::cin>>x;
  ((x%2)==0) ? std::cout<<"Possible" : std::cout<<"Not possible";
}