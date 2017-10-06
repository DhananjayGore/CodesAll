int count=0;int x=0,y=0;
        int len=X.size();
        for(int i=0;i < len-1;i++)
        {
            x=X.get(i)-X.get(i+1);
            if(x<0)
            {
            x=x*-1;
            }
           
            y=Y.get(i)-Y.get(i+1);
            if(y<0)
            {
              y=y*-1;  
            }
            if(x>y)
            {
                count=count+x;
            }
            else
            {
                count=count+y;
            }
        
        }
        return count;