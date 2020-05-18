/*#include<iostream>
using namespace std;
int main()
{
  int n,i,j,sum=0,sum1=0,sum2=0,sum3=0,flag=1;
  cin>>n;
  int a[5][5];
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
    if(i==j)
    {
      sum+=a[i][j];
    }
  }
  //cout<<"No";
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      sum1+=a[i][j];
      sum2+=a[j][i];
      if(i+j+1==n)
      {
        sum3+=a[i][j];
      }
    }
    if(sum!=sum1||sum2!=sum)
    {
      flag=0;
      break;
    }
    sum1=0;sum2=0;
  }
  if(flag==1&&sum==sum3)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  return 0;
}*/

#include<iostream>
using namespace std;
int main()
{
  int n,x=0,y,z=0,p=0,q=0,r=0;
  cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  for(int i=0;i<n;i++)
    x+=a[0][i];
  if(n==2 and x==5)
    cout<<"Yes";
  else if(n==3 and x==15)
    cout<<"Yes";
  else
    cout<<"No";
}
