(define (cheko_date lst1)
	(cond ( (and (> (cadr lst1) 32) (> (caddr lst1) 13) (> (cadddr lst1) 2016) (< (cadddr lst1) 0))
		"invalid")
                ((and (or (= (caddr lst1) 4) (= (caddr lst1) 6) (= (caddr lst1) 9) (= (caddr lst1) 11)) (< (cadr lst1) 31))
                1)
                ((and (or (= (caddr lst1) 1) (= (caddr lst1) 3) (= (caddr lst1) 5) (= (caddr lst1) 7) (= (caddr lst1) 8) (= (caddr lst1) 10) (= (caddr lst1) 12)) (< (cadr lst1) 31))
                1)
                ((and (= (caddr lst1) 2) (= (remainder (cadddr lst1) 100) 0) (not (= (remainder (cadddr lst1) 400) 0)) (< (cadr lst1) 29))
                1)
                ((and (= (caddr lst1) 2) (= (remainder (cadddr lst1) 400) 0)  (< (cadr lst1) 30))
                1)
                ((and (= (caddr lst1) 2) (= (remainder (cadddr lst1) 4) 0) (not (and(= (remainder (cadddr lst1) 400) 0) (= (remainder (cadddr lst1) 100) 0))) (< (cadr lst1) 30))
                1)
                (else "invalid"))
)
                
