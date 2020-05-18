/*#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int a[m][n],b[m];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      b[j]=a[i][j];
    }
    /*for(int k=0;k<n;k++)
    {
      cout<<b[k];
    }*/
    
   /* if(b[0]>b[1])
    {
      cout<<b[0]<<endl;
    }
    else
    {
      cout<<b[1]<<endl;
    }
  }
  
}*/
  
  
  
#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,max=0;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  max=a[0][0];
  for(i=0;i<r;i++)
  {
    max=a[i][0];
    for(j=0;j<c;j++)
    {
      if(max<=a[i][j])
        max=a[i][j];
    }
    cout<<max<<"\n";
  }
}