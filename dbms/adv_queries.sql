-- join 2 different tables on different properties (similar to populate)

SELECT * from bands JOIN albums ON bands.id = albums.band_id; -- INNER JOIN is the same as JOIN
-- It only returns the rows where the join condition is met

SELECT * from bands LEFT JOIN albums ON bands.id = albums.band_id; 
-- returns all rows from the left table, and the matched rows from the right table

-- For Example - 
-- id    name	id	name	release_year	band_id

-- 1	The Beatles	1	Please Please Me	1963	1
-- 1	The Beatles	2	With The Beatles	1963	1
-- 2	The Rolling Stones	3	A Hard Day's Night	1964	2
-- 2	The Rolling Stones	4	Beatles For Sale	1964	2
-- 3	The Who	5	Revolver	1965	3
-- 3	The Who	6	Rubber Soul	1965	3
-- 3	The Who	7	Revolver	1966	3
-- 4	The Kinks	
-- 5	The Animals

SELECT * from albums RIGHT JOIN bands ON bands.id = albums.band_id;
-- returns all rows from the right table, and the matched rows from the left table

-- id	name	id	name	release_year	band_id

-- 1	The Beatles	1	Please Please Me	1963	1
-- 1	The Beatles	2	With The Beatles	1963	1
-- 2	The Rolling Stones	3	A Hard Day's Night	1964	2
-- 2	The Rolling Stones	4	Beatles For Sale	1964	2
--                      	5	Revolver	1965	3
--                      	6	Rubber Soul	1965	3


-- Aggregate Functions

SELECT AVG(release_year) FROM albums;

SELECT SUM(release_year) FROM albums;

SELECT COUNT(*) FROM bands;

-- GROUP BY

SELECT band_id, COUNT(band_id) FROM albums GROUP BY band_id;
-- band_id	COUNT(band_id)
-- 1	2
-- 2	1
-- 3	3

SELECT b.name AS band_name, COUNT(a.id) AS album_count 
FROM bands AS b 
LEFT JOIN albums AS a ON b.id = a.band_id 
GROUP BY b.name;
-- band_name	album_count

-- The Beatles	2
-- The Rolling Stones	2
-- The Who	3
-- The Kinks	0

SELECT b.name AS band_name, COUNT(a.id) AS album_count 
FROM bands AS b 
LEFT JOIN albums AS a ON b.id = a.band_id 
GROUP BY b.name
HAVING album_count = 1;
-- band_name	album_count

-- The Beatles	2
-- The Rolling Stones	2