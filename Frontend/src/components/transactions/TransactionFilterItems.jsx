const TransactionFilterItems = () => {
  return (
    <section
      className="w-full border-b border-gray-200 py-4"
      aria-label="Transaction filters"
    >
      <div className="grid grid-cols-1 gap-3 sm:grid-cols-3 sm:gap-4">
        <div className="min-w-0">
          <label
            htmlFor="selectByType"
            className="mb-1.5 block text-sm font-semibold text-gray-800"
          >
            Type
          </label>
          <select
            name="type"
            id="selectByType"
            defaultValue=""
            className="h-10 w-full rounded-md border border-gray-300 bg-white px-3 text-sm text-gray-700 outline-none transition hover:border-gray-400 focus:border-gray-900 focus:ring-2 focus:ring-gray-900/10"
          >
            <option value="">All types</option>
            <option value="EXPENSE">Expense</option>
            <option value="INCOME">Income</option>
          </select>
        </div>
        <div className="min-w-0">
          <label
            htmlFor="selectByCategory"
            className="mb-1.5 block text-sm font-semibold text-gray-800"
          >
            Category
          </label>
          <select
            name="category"
            id="selectByCategory"
            defaultValue="all"
            className="h-10 w-full rounded-md border border-gray-300 bg-white px-3 text-sm text-gray-700 outline-none transition hover:border-gray-400 focus:border-gray-900 focus:ring-2 focus:ring-gray-900/10"
          >
            <option value="all">All categories</option>
            <option value="food">Food</option>
            <option value="bills">Bills</option>
          </select>
        </div>
        <div className="min-w-0">
          <label
            htmlFor="selectByDate"
            className="mb-1.5 block text-sm font-semibold text-gray-800"
          >
            Date
          </label>
          <select
            name="date"
            id="selectByDate"
            defaultValue="this-month"
            className="h-10 w-full rounded-md border border-gray-300 bg-white px-3 text-sm text-gray-700 outline-none transition hover:border-gray-400 focus:border-gray-900 focus:ring-2 focus:ring-gray-900/10"
          >
            <option value="this-month">This month</option>
            <option value="last-month">Last month</option>
            <option value="last-year">Last year</option>
          </select>
        </div>
      </div>
    </section>
  );
};

export default TransactionFilterItems;
