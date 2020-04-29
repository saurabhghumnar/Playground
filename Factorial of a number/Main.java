#include<iostream>
int main(){
  int n;
  int fact=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    fact=fact*i;
  }
  std::cout<<fact;
}