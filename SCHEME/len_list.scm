(define (len list)
	(cond 
		((null? list)
		0)
		(else (1+(len (cdr list))))
	)
)
