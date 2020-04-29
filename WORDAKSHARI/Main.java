#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int i=0;
  int count=1;
string s[20];
  cin>>s[0];

for( i=1;i<20;i++)
{
  cin>>s[i];
  if(s[i]=="####")
  {
    break;
  }
  count++;
}
cout<<s[0]<<"\n";
for(int i=1;i<=count;i++)
{
  string::iterator end=(s[i-1].end())-1;
  string::iterator start=s[i].begin();

  if((*start)==(*end))
  {
  	cout<<s[i]<<"\n";
  }
	else
    {
      break;

    }
}

}
