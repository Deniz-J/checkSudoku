boolean sudoku(int[][] grid) {

boolean s = checkSubgrids(grid);
boolean r = rowCheck(grid);
boolean c = columnCheck(grid);

return s && r && c;
}
boolean checkSubgrids(int[][] grid){
    int r=0;
    int rd=9;
    int c=0;
    int cr=9;
    while(r<rd-2 && c<cr-2){
    HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=r; i<r+3; i++){
          for(int j=c; j<c+3; j++){
              if(hs.contains(grid[i][j])){
                return false;                    
           }
            hs.add(grid[i][j]);
        }        
                                 
    }  
         r+=3; c+=3;
}     
return true;
}

boolean rowCheck(int[][] grid){
    int i=0;
    while(i<9){
        HashSet<Integer> hs = new HashSet<Integer>();
          for(int j=0; j<9; j++){
            if(hs.contains(grid[i][j])){
                 return false;                    
            }
             hs.add(grid[i][j]);
          } 
          i++;                          
     }
    return true;
}
boolean columnCheck(int[][] grid){
    int j=0;
    while(j<9){
        HashSet<Integer> hs = new HashSet<Integer>();
          for(int i=0; i<9; i++){
                           
            if(hs.contains(grid[i][j])){
                 return false;                    
            }
             hs.add(grid[i][j]);
          } 
          j++;                          
     }
    return true;
}
