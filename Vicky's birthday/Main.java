#include <iostream>
int main() 
{
  int x;
  std::cin>>x;
  if((x%4)==0)
  {
    if((x%100)==0)
    {
      if((x%400)==0)
      {
         std::cout<<"Vicky can celebrate his birthday.";
      }
      else
      {
        std::cout<<"Vicky can't celebrate.";
      }
    }
    else
    {
      std::cout<<"Vicky can celebrate his birthday.";
    }
  }
  else
  {
    std::cout<<"Vicky can't celebrate.";
  }
}