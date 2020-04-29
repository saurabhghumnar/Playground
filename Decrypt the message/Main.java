#include<iostream>
int main()
{
  int h,t,n,sum=0;
  std::cin>>h>>t;
  n=h+t;
  for(int i=1;i<n;i++)
  {
    if(n%i==0)
    {
      sum=sum+i;
    }
  }
  if(sum==n)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
}