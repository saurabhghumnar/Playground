#include<iostream>
#include<string.h>
using namespace std;
int main()
{
string str;
  string s;
  cin>>str;

  for(int i=0;i<str.length();i++)
  {
    if(str[i]>='a' && str[i]<='z' || str[i]>='A' && str[i]<='Z')
    {
     cout<<str[i];
    }
	}
 /* for(int i=0;i<s.length();i++)
    cout<<s[i];*/
}