#include<iostream>
using namespace std;
int main()
{
  int x,y,z,out,gcd;
  cin>>x>>y>>z>>out;
  int smallest;
  if(x<y && x<z)
    smallest=x;
  else if(y<x && y<z)
    smallest=y;
  else
    smallest=z;
  while(smallest>=1)
  {
    if(x%smallest==0 && y%smallest==0 && z%smallest==0)
    {
      gcd=smallest;
      break;
    }
    smallest--;
  
  }
  if(gcd==out)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}