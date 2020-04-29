#include<iostream>
using namespace std;
int main()
{
int n,i;
  std::cin>>n;
  if(n!=1)
  {
  do
  {
    if(n%2==0)
    {
      std::cout<<n<<"\n";
      n=n/2;
      i++;
    }
    else
    {
      std::cout<<n<<"\n";
      n=3*n+1;
      i++;
    }
  }while(n!=1);
  std::cout<<1<<"\n";
std::cout<<i;
  }
  else
  {
      std::cout<<1<<"\n";
std::cout<<0;
  }
}