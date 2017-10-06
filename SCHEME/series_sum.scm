(define (sum x n)
        (if (= n 0)
        1
        (+ (/ (expt x (- n 1)) (fact (- n 1))) (sum x (- n 1)) )))
 (define (fact n)
	(cond	(
		(= n 0) 
		1)
		(else
		 (* n (fact (- n 1)))
		 )
		 ))
