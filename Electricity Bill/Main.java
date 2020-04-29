#include<iostream>
using namespace std;
int main()
{
int unit;
  cin>>unit;
  if(unit<=200)
    cout<<"Rs."<<int(0.5*unit);
  else if(unit>200 && unit<=400)
    cout<<"Rs."<<int((0.65*unit)+100);
  else if(unit>400 && unit<=600)
    cout<<"Rs."<<int((0.80*unit)+200);
  else if(unit>600)
    cout<<"Rs."<<int((1.25*unit)+425);
  else
    cout<<"Invalid";
}