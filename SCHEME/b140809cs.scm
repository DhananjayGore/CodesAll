(define (delete_max lst1)
	  (cond ((null? lst1) "emt")
	        ((= (car lst1) (maxof lst1)))
		  (else (cons (car lst1) (delete_max (cdr lst1)))))	  
)




(define (maxof lst)
	(cond ((null? lst) 0)
	 ((> (car lst) (maxof (cdr lst)))
		(car lst))
         (else(maxof (cdr lst))))
)
