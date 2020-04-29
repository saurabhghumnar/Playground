#include <iostream>
int main() 
{
	int n;
  std::cin>>n;
  while(n>0)
  {
    int a=n%10;
    if(a==0)
    {
    }
    else
      std::cout<<a;
    n=n/10;
  }
	return 0;
}