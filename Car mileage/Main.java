#include<iostream>
using namespace std;
int main()
{
float mileage;
  float petrol,distance;
  cin>>mileage>>petrol>>distance;
  if((distance/petrol)<=mileage)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}