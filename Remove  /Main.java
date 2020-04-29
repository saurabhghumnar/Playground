#include<iostream>
#include<string.h>
using namespace std;
int main()
{
string s;
  getline(cin,s);
int len=s.length();
 
  int  index=s.find("the");
  s.erase(index,4);
    index=s.find("the");
  s.erase(index,4);
 cout<<s<<"\n";
}