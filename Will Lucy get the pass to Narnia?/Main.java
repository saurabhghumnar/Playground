#include<iostream>
int main()
{
std::cout<<"Enter first number : Enter second number : Menu";
std::cout<<"\n1.Addition";
std::cout<<"\n2.Subtraction";
std::cout<<"\n3.Multiplication";
std::cout<<"\n4.Division";
std::cout<<"\n5.Remainder\n";
int x,y,n;
  std::cin>>x>>y>>n;
  switch(n)
  {
    case 1:
      std::cout<<x+y;
      break;
    case 2:
      std::cout<<x-y;
      break;
      case 3:
      std::cout<<x*y;
      break;
      case 4:
      std::cout<<x/y;
      break;
      case 5:
      std::cout<<x%y;
      break;
    default:
      std::cout<<"Invalid operation";
  }
}