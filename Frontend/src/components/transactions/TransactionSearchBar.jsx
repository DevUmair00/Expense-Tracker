import { Search } from "lucide-react";

const TransactionSearchBar = () => {
  return (
    <div>
      <div className="mx-auto w-full">
        <div className="relative">
          <Search
            aria-hidden="true"
            className="pointer-events-none absolute left-3 top-1/2 size-5 -translate-y-1/2 text-gray-400"
          />
          <input
            id="transactionSearch"
            type="search"
            placeholder="Search transaction..."
            className="h-11 w-full rounded-md border border-gray-300 bg-gray-50 pl-10 pr-4 text-sm text-gray-900 outline-none transition placeholder:text-gray-400 hover:border-gray-400 focus:border-gray-900 focus:bg-white focus:ring-2 focus:ring-gray-900/10"
          />
        </div>
      </div>
    </div>
  );
};

export default TransactionSearchBar;
