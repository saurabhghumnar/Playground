#include<iostream>
int main()
{
  int x,y;
  std::cin>>x>>y;
  if(y<x)
     std::cout<<"Yes, you can enter.";
  else if(y==x)
     std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
     std::cout<<"Sorry, you can't enter";
}