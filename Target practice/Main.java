#include<iostream>
using namespace std;
int main()
{
  int a,b,c=0,d=0;
  std::cin>>a>>b;
  if(a<=b)
    std::cout<<"The number of turns is 1";
  else
  {
   while (a>d)
    {
      d=d+b;
      c=c+1;
      std::cin>>b;
    }
    std::cout<<"The number of turns is "<<c;
  }
  return 0;
}

