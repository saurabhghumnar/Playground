#include<iostream>
using namespace std;
int main()
{
int age,price;
  float time;
  cin>>age>>time;
  float matinee=13.30;
  if(age<=13)
  {
    if(time==matinee)
    {
      cout<<"$2.00";
    }
    else
    {
      cout<<"$4.00";
    }
    }
  else
  {
    if(time==matinee)
    {
      cout<<"$5.00";
    }
    else
    {
      cout<<"$8.00";
    }
  }
  
}