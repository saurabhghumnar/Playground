#include<iostream>
using namespace std;
int main()
{
int b,c;
  cin>>b>>c;
  if(c<b)
  {
    c+=100;
    cout<<c-b;
  }
  else
    cout<<c-b;
}