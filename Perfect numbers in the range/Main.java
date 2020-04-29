#include<iostream>
int main()
{
  int x,y;
  std::cin>>x>>y;
  for(int k=x;k<=y;k++)
  {
    int sum=0;
     for(int i=1;i<k;i++)
  {
    if(k%i==0)
    {
      sum=sum+i;
    }
  }
  if(sum==k)
  {
    std::cout<<sum<<" ";
  }
  }
}