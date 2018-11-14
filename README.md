1.a. Bubble Sort adalah pengurutan dengan cara pertukaran data dengan data disebelahnya secara terus menerus sampai dalam satu iterasi 
     tertentu tidak ada lagi perubahan.
     
     swapped = true
      while swapped
        swapped = false
        for j from 0 to N - 1
           if a[j] > a[j + 1]
              swap( a[j], a[j + 1] )
              swapped = true

1.b. Insertion sort adalah sebuah metode pengurutan data dengan menempatkan setiap elemen data pada pisisinya dengan cara melakukan 
     perbandingan dengan data – data yang ada.

     //Array
      A = {1...n}
      //Sort algorithm
        for i = 2 to n
        j = i
        while j > 1
        if A[j] < A[j - 1]
         swap A[j] and A[j - 1]
          j = j - 1
          
1.c.  selection sort adalah mencari elemen yang tepat untuk diletakkan di posisi yang telah diketahui, dan meletakkannya di posisi 
      tersebut setelah data tersebut ditemukan, Selection Sort Membandingkan elemen yang sekarang dengan elemen yang berikutnya sampai 
      dengan elemen yang terakhir.
      
   Pseudocode of Selection Sort
SELECTION-SORT(A)
    for j ← 1 to n-1
          smallest ← j
           for i ← j + 1 to n
                   if A[ i ] < A[ smallest ]
                          smallest ← i
            Exchange A[ j ] ↔ 
            
            
1.d Prinsip utama yang diimplementasikan pada algoritme urut gabung seringkali disebut sebagai pecah-belah dan taklukkan (bahasa Inggris: divide and conquer). Cara kerja algoritme urut gabung adalah membagi larik data yang diberikan menjadi dua bagian yang lebih kecil. Kedua larik yang baru tersebut kemudian akan diurutkan secara terpisah. Setelah kedua buah list tersusun, maka akan dibentuk larik baru sebagai hasil penggabungan dari dua buah larik sebelumnya.

func mergesort( var a as array )
     if ( n == 1 ) return a

     var l1 as array = a[0] ... a[n/2]
     var l2 as array = a[n/2+1] ... a[n]

     l1 = mergesort( l1 )
     l2 = mergesort( l2 )

     return merge( l1, l2 )
end func

func merge( var a as array, var b as array )
     var c as array

     while ( a and b have elements )
          if ( a[0] > b[0] )
               add b[0] to the end of c
               remove b[0] from b
          else
               add a[0] to the end of c
               remove a[0] from a
     while ( a has elements )
          add a[0] to the end of c
          remove a[0] from a
     while ( b has elements )
          add b[0] to the end of c
          remove b[0] from b
     return c
end func

1.eMetode Shell Sort. Metode ini mengurutkan data dengan cara membandingkan suatu data dengan data lain yang memiliki jarak tertentu, kemudian dilakukan penukaran bila diperlukan. Proses pengurutan dengan metode Shell dapat dijelaskan sebagai berikut : 
Pertama-tama adalah menentukan jarak mula-mula dari data yang akan dibandingkan, yaitu N / 2. Data pertama dibandingkan dengan data dengan jarak N / 2. Apabila data pertama lebih besar dari data ke N / 2 tersebut maka kedua data tersebut ditukar. Kemudian data kedua dibandingkan dengan jarak yang sama yaitu N / 2. Demikian seterusnya sampai seluruh data dibandingkan sehingga semua data ke-j selalu lebih kecil daripada data ke-(j + N / 2).


procedure shellSort()
   A : array of items 
	
   /* calculate interval*/
   while interval < A.length /3 do:
      interval = interval * 3 + 1	    
   end while
   
   while interval > 0 do:

      for outer = interval; outer < A.length; outer ++ do:

      /* select value to be inserted */
      valueToInsert = A[outer]
      inner = outer;

         /*shift element towards right*/
         while inner > interval -1 && A[inner - interval] >= valueToInsert do:
            A[inner] = A[inner - interval]
            inner = inner - interval
         end while

      /* insert the number at hole position */
      A[inner] = valueToInsert

      end for

   /* calculate interval*/
   interval = (interval -1) /3;	  

   end while
   
end procedure

1.f Quick Sort adalah algoritma pengurutan yang sangat cepat dengan tipe penyelesaian divide and conquer. sehingga cocok untuk mengurutkan data dalam jumlah besar. Proses pengurutan Quick Sort adalah sebagai berikut:

Quicksort(A,p,r) {
    if (p < r) {
       q <- Partition(A,p,r)
       Quicksort(A,p,q)
       Quicksort(A,q+1,r)
    }
}



Partition(A,p,r)
    x <- A[p]
    i <- p-1
    j <- r+1
    while (True) {
        repeat
            j <- j-1
        until (A[j] <= x)
        repeat
            i <- i+1
        until (A[i] >= x)
        if (i A[j]
        else 
            return(j)
    }
}
