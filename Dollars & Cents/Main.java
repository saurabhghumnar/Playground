#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,dollar,cent,extra;
  std::cin>>d1>>c1>>d2>>c2;
  cent=c1+c2;
  if(cent>=100)
  {
    extra=cent/100;
    cent=cent%100;
  }
  dollar=d1+d2+extra;
  std::cout<<dollar;
  std::cout<<"\n"<<cent;
}