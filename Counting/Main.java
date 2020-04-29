#include<iostream>
#include<string.h>
using namespace std;
int main()
{
string s;
  getline(cin,s);

int len=s.length();

  int vowels=0,consonants=0,spaces=0,digits=0,symbols=0;
  for(int i=0;i<len;i++)
  {
    if(s[i]==' ')
    {
      spaces++;
    }
      else if(s[i]>='a'&&s[i]<='z' || s[i]>='A'&& s[i]<='Z')
    {
      if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
      {
      	vowels++;
      }
      else
      {
        consonants++;
      }
    }
    else if(s[i]>='0' && s[i]<='9')
    {
      digits++;
    }
      else
      {
        symbols++;
      }
  }
  cout<<"Vowels:"<<vowels;
  cout<<"\nConsonants:"<<consonants;
  cout<<"\nWhite Spaces:"<<spaces;
  cout<<"\nDigits:"<<digits;
  cout<<"\nSymbols:"<<symbols;
}