package io.crnk.example.springboot.domain.repository;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryV2;
import io.crnk.core.resource.links.PagedLinksInformation;
import io.crnk.core.resource.list.ResourceListBase;
import io.crnk.core.resource.meta.PagedMetaInformation;
import io.crnk.example.springboot.domain.model.TTTT;

public interface TTTTRepository extends ResourceRepositoryV2<TTTT, String> {

	@Override
	TTTTList findAll(QuerySpec querySpec);

	class TTTTListMeta implements PagedMetaInformation {

		private Long totalResourceCount;

		@Override
		public Long getTotalResourceCount() {
			return totalResourceCount;
		}

		@Override
		public void setTotalResourceCount(Long totalResourceCount) {
			this.totalResourceCount = totalResourceCount;
		}

	}

	class TTTTListLinks implements PagedLinksInformation {

		private String first;

		private String last;

		private String next;

		private String prev;

		@Override
		public String getFirst() {
			return first;
		}

		@Override
		public void setFirst(String first) {
			this.first = first;
		}

		@Override
		public String getLast() {
			return last;
		}

		@Override
		public void setLast(String last) {
			this.last = last;
		}

		@Override
		public String getNext() {
			return next;
		}

		@Override
		public void setNext(String next) {
			this.next = next;
		}

		@Override
		public String getPrev() {
			return prev;
		}

		@Override
		public void setPrev(String prev) {
			this.prev = prev;
		}

	}

	class TTTTList extends ResourceListBase<TTTT, TTTTListMeta, TTTTListLinks> {

	}
}
 